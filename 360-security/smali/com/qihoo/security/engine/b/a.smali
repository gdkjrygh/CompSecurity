.class public Lcom/qihoo/security/engine/b/a;
.super Ljava/lang/Object;


# instance fields
.field final a:Landroid/content/Context;

.field final b:Lcom/qihoo/security/engine/b/c;

.field private c:Lorg/xmlpull/v1/XmlPullParser;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/qihoo/security/engine/b/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    iput-object p1, p0, Lcom/qihoo/security/engine/b/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/qihoo/security/engine/b/a;->b:Lcom/qihoo/security/engine/b/c;

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    const/4 v3, 0x0

    const-string/jumbo v0, "Item"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    const-string/jumbo v1, "key"

    invoke-interface {v0, v3, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    const-string/jumbo v2, "value"

    invoke-interface {v1, v3, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/engine/b/a;->b:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/engine/b/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/qihoo/security/engine/b/a;->b:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v2, v0, v1}, Lcom/qihoo/security/engine/b/c;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;I)V
    .locals 4

    const/4 v3, 0x0

    const-string/jumbo v0, "Enabled"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string/jumbo v0, "1"

    iget-object v1, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    const-string/jumbo v2, "value"

    invoke-interface {v1, v3, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/a;->b:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    const/4 v1, 0x1

    invoke-virtual {v0, p2, v1}, Lcom/qihoo/security/engine/e/c;->a(IZ)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string/jumbo v0, "Item"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    const-string/jumbo v1, "key"

    invoke-interface {v0, v3, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    const-string/jumbo v2, "value"

    invoke-interface {v1, v3, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lcom/qihoo/security/engine/b/a;->b:Lcom/qihoo/security/engine/b/c;

    iget-object v2, v2, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v2}, Lcom/qihoo/security/services/d;->e()Lcom/qihoo/security/services/a;

    move-result-object v2

    invoke-interface {v2, p2, v0, v1}, Lcom/qihoo/security/services/a;->a(ILjava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_2
    const-string/jumbo v0, "Policy"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    const-string/jumbo v1, "key"

    invoke-interface {v0, v3, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    const-string/jumbo v2, "value"

    invoke-interface {v1, v3, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "task"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :try_start_1
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    :goto_1
    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/a;->b:Lcom/qihoo/security/engine/b/c;

    iget-object v1, v1, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v1, p2, v0}, Lcom/qihoo/security/engine/e/c;->a(II)V

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method private b()V
    .locals 9

    const/4 v2, 0x1

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v6, 0x0

    const/4 v1, -0x1

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    move v5, v6

    move v8, v1

    move v1, v0

    move v0, v8

    :goto_0
    if-ne v1, v2, :cond_0

    :goto_1
    return-void

    :cond_0
    iget-object v7, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v7

    if-ne v1, v4, :cond_3

    packed-switch v5, :pswitch_data_0

    :goto_2
    :pswitch_0
    move v1, v5

    :goto_3
    iget-object v5, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    move v8, v5

    move v5, v1

    move v1, v8

    goto :goto_0

    :pswitch_1
    const-string/jumbo v1, "Global"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_3

    :cond_1
    const-string/jumbo v1, "Enumerators"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v3

    goto :goto_3

    :cond_2
    const-string/jumbo v1, "EngineConfigs"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v4

    goto :goto_3

    :pswitch_2
    invoke-direct {p0, v7}, Lcom/qihoo/security/engine/b/a;->a(Ljava/lang/String;)V

    move v1, v5

    goto :goto_3

    :pswitch_3
    const-string/jumbo v1, "File"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0xa

    goto :goto_3

    :pswitch_4
    invoke-direct {p0}, Lcom/qihoo/security/engine/b/a;->c()I

    move-result v1

    if-lez v1, :cond_4

    const/16 v0, 0xb

    move v8, v1

    move v1, v0

    move v0, v8

    goto :goto_3

    :pswitch_5
    invoke-direct {p0, v7, v0}, Lcom/qihoo/security/engine/b/a;->a(Ljava/lang/String;I)V

    move v1, v5

    goto :goto_3

    :pswitch_6
    invoke-direct {p0, v7}, Lcom/qihoo/security/engine/b/a;->b(Ljava/lang/String;)V

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_3
    if-ne v1, v3, :cond_4

    packed-switch v5, :pswitch_data_1

    :cond_4
    :pswitch_7
    move v1, v5

    goto :goto_3

    :pswitch_8
    const-string/jumbo v1, "Global"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v6

    goto :goto_3

    :pswitch_9
    const-string/jumbo v1, "Enumerators"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v6

    goto :goto_3

    :pswitch_a
    const-string/jumbo v1, "EngineConfigs"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v6

    goto :goto_3

    :pswitch_b
    const-string/jumbo v1, "File"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v3

    goto/16 :goto_3

    :pswitch_c
    const-string/jumbo v1, "EngineConfig"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_4

    move v1, v4

    goto/16 :goto_3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_a
        :pswitch_9
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_b
        :pswitch_c
    .end packed-switch
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    const/4 v3, 0x0

    const-string/jumbo v0, "Item"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    const-string/jumbo v1, "key"

    invoke-interface {v0, v3, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    const-string/jumbo v2, "value"

    invoke-interface {v1, v3, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/engine/b/a;->b:Lcom/qihoo/security/engine/b/c;

    iget-object v2, v2, Lcom/qihoo/security/engine/b/c;->j:Lcom/qihoo/security/engine/b/b;

    const/4 v3, 0x4

    invoke-virtual {v2, v3, v0, v1}, Lcom/qihoo/security/engine/b/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private c()I
    .locals 3

    iget-object v0, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    const/4 v1, 0x0

    const-string/jumbo v2, "id"

    invoke-interface {v0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method


# virtual methods
.method a()Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/engine/b/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string/jumbo v2, "res/xml/config.xml"

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->openXmlResourceParser(Ljava/lang/String;)Landroid/content/res/XmlResourceParser;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :try_start_1
    iput-object v0, p0, Lcom/qihoo/security/engine/b/a;->c:Lorg/xmlpull/v1/XmlPullParser;

    invoke-direct {p0}, Lcom/qihoo/security/engine/b/a;->b()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :catch_0
    move-exception v1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_1
    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_2
    throw v0

    :catchall_1
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_1
.end method
