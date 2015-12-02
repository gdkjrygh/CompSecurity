.class public Landroid_src/mms/c;
.super Ljava/lang/Object;
.source "MmsConfig.java"


# static fields
.field private static A:I

.field private static B:I

.field private static C:Z

.field private static D:I

.field private static E:I

.field private static F:I

.field private static a:Z

.field private static b:I

.field private static c:I

.field private static d:Ljava/lang/String;

.field private static e:Ljava/lang/String;

.field private static f:Ljava/lang/String;

.field private static g:Ljava/lang/String;

.field private static h:Ljava/lang/String;

.field private static i:Ljava/lang/String;

.field private static j:I

.field private static k:I

.field private static l:I

.field private static m:I

.field private static n:I

.field private static o:I

.field private static p:I

.field private static q:I

.field private static r:I

.field private static s:Z

.field private static t:Z

.field private static u:I

.field private static v:Z

.field private static w:Z

.field private static x:Z

.field private static y:Z

.field private static z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x4

    const/4 v4, 0x2

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 47
    sput-boolean v3, Landroid_src/mms/c;->a:Z

    .line 48
    sput v1, Landroid_src/mms/c;->b:I

    .line 49
    const v0, 0x96000

    sput v0, Landroid_src/mms/c;->c:I

    .line 50
    const-string v0, "Android-Mms/2.0"

    sput-object v0, Landroid_src/mms/c;->d:Ljava/lang/String;

    .line 51
    const-string v0, "x-wap-profile"

    sput-object v0, Landroid_src/mms/c;->e:Ljava/lang/String;

    .line 52
    sput-object v2, Landroid_src/mms/c;->f:Ljava/lang/String;

    .line 53
    sput-object v2, Landroid_src/mms/c;->g:Ljava/lang/String;

    .line 54
    sput-object v2, Landroid_src/mms/c;->h:Ljava/lang/String;

    .line 55
    sput-object v2, Landroid_src/mms/c;->i:Ljava/lang/String;

    .line 56
    const/16 v0, 0x4b0

    sput v0, Landroid_src/mms/c;->j:I

    .line 57
    const/16 v0, 0x640

    sput v0, Landroid_src/mms/c;->k:I

    .line 58
    const v0, 0x7fffffff

    sput v0, Landroid_src/mms/c;->l:I

    .line 59
    const/16 v0, 0x1f4

    sput v0, Landroid_src/mms/c;->m:I

    .line 60
    const/16 v0, 0x32

    sput v0, Landroid_src/mms/c;->n:I

    .line 61
    sput v4, Landroid_src/mms/c;->o:I

    .line 62
    const/16 v0, 0x1388

    sput v0, Landroid_src/mms/c;->p:I

    .line 63
    const v0, 0xea60

    sput v0, Landroid_src/mms/c;->q:I

    .line 64
    const/4 v0, 0x7

    sput v0, Landroid_src/mms/c;->r:I

    .line 65
    sput-boolean v3, Landroid_src/mms/c;->s:Z

    .line 66
    sput-boolean v1, Landroid_src/mms/c;->t:Z

    .line 69
    sput v5, Landroid_src/mms/c;->u:I

    .line 79
    sput-boolean v1, Landroid_src/mms/c;->v:Z

    .line 81
    sput-boolean v1, Landroid_src/mms/c;->w:Z

    .line 82
    sput-boolean v1, Landroid_src/mms/c;->x:Z

    .line 83
    sput-boolean v1, Landroid_src/mms/c;->y:Z

    .line 84
    sput-boolean v1, Landroid_src/mms/c;->z:Z

    .line 85
    const/4 v0, -0x1

    sput v0, Landroid_src/mms/c;->A:I

    .line 90
    sput v5, Landroid_src/mms/c;->B:I

    .line 93
    sput-boolean v3, Landroid_src/mms/c;->C:Z

    .line 94
    sput v4, Landroid_src/mms/c;->D:I

    .line 95
    const/16 v0, 0x30

    sput v0, Landroid_src/mms/c;->E:I

    .line 97
    const/16 v0, 0x28

    sput v0, Landroid_src/mms/c;->F:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 108
    invoke-static {p0}, Landroid_src/mms/c;->b(Landroid/content/Context;)V

    .line 112
    const-string v0, "htc first"

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "mystul"

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    :cond_0
    invoke-static {}, Landroid_src/mms/c;->p()V

    .line 116
    :cond_1
    return-void
.end method

.method public static final a(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 2

    .prologue
    .line 275
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 279
    :cond_1
    return-void
.end method

.method public static final a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x2

    .line 257
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    if-eq v0, v2, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 262
    :cond_1
    if-eq v0, v2, :cond_2

    .line 263
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "No start tag found"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 266
    :cond_2
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 267
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected start tag: found "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", expected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 270
    :cond_3
    return-void
.end method

.method public static a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 123
    sget v1, Landroid_src/mms/c;->b:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b()I
    .locals 1

    .prologue
    .line 130
    sget v0, Landroid_src/mms/c;->c:I

    return v0
.end method

.method private static b(Landroid/content/Context;)V
    .locals 11

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 283
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v4, Lcom/facebook/r;->mms_config:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v4

    .line 286
    :try_start_0
    const-string v0, "mms_config"

    invoke-static {v4, v0}, Landroid_src/mms/c;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)V

    .line 289
    :cond_0
    :goto_0
    invoke-static {v4}, Landroid_src/mms/c;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 290
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 291
    if-nez v5, :cond_2

    .line 392
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->close()V

    .line 397
    :goto_1
    invoke-static {}, Landroid_src/mms/c;->a()Z

    move-result v0

    if-eqz v0, :cond_23

    sget-object v0, Landroid_src/mms/c;->f:Ljava/lang/String;

    if-nez v0, :cond_23

    .line 398
    const-string v0, "uaProfUrl"

    .line 401
    :goto_2
    if-eqz v0, :cond_1

    .line 402
    const-string v1, "MmsConfig.loadMmsSettings mms_config.xml missing %s setting"

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 405
    const-string v1, "MmsConfig"

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    :cond_1
    return-void

    .line 294
    :cond_2
    const/4 v0, 0x0

    :try_start_1
    invoke-interface {v4, v0}, Landroid/content/res/XmlResourceParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v6

    .line 295
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Landroid/content/res/XmlResourceParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v7

    .line 297
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->next()I

    move-result v0

    const/4 v8, 0x4

    if-ne v0, v8, :cond_24

    .line 298
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getText()Ljava/lang/String;

    move-result-object v0

    .line 302
    :goto_3
    const-string v8, "MmsConfig"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "tag: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " value: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " - "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    const-string v8, "name"

    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 306
    const-string v6, "bool"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 308
    const-string v5, "enabledMMS"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 309
    const-string v5, "true"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    :goto_4
    sput v0, Landroid_src/mms/c;->b:I
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 385
    :catch_0
    move-exception v0

    .line 386
    :try_start_2
    const-string v5, "MmsConfig"

    const-string v6, "loadMmsSettings caught "

    invoke-static {v5, v6, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 392
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->close()V

    goto/16 :goto_1

    :cond_3
    move v0, v3

    .line 309
    goto :goto_4

    .line 310
    :cond_4
    :try_start_3
    const-string v5, "enabledTransID"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 311
    const-string v5, "true"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Landroid_src/mms/c;->a:Z
    :try_end_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    .line 387
    :catch_1
    move-exception v0

    .line 388
    :try_start_4
    const-string v5, "MmsConfig"

    const-string v6, "loadMmsSettings caught "

    invoke-static {v5, v6, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 392
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->close()V

    goto/16 :goto_1

    .line 312
    :cond_5
    :try_start_5
    const-string v5, "enabledNotifyWapMMSC"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 313
    const-string v5, "true"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Landroid_src/mms/c;->s:Z
    :try_end_5
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_0

    .line 389
    :catch_2
    move-exception v0

    .line 390
    :try_start_6
    const-string v5, "MmsConfig"

    const-string v6, "loadMmsSettings caught "

    invoke-static {v5, v6, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 392
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->close()V

    goto/16 :goto_1

    .line 314
    :cond_6
    :try_start_7
    const-string v5, "aliasEnabled"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 315
    const-string v5, "true"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Landroid_src/mms/c;->C:Z
    :try_end_7
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_7 .. :try_end_7} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_0

    .line 392
    :catchall_0
    move-exception v0

    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->close()V

    throw v0

    .line 316
    :cond_7
    :try_start_8
    const-string v5, "allowAttachAudio"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 317
    const-string v5, "true"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Landroid_src/mms/c;->t:Z

    goto/16 :goto_0

    .line 318
    :cond_8
    const-string v5, "enableMultipartSMS"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 319
    const-string v5, "true"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Landroid_src/mms/c;->v:Z

    goto/16 :goto_0

    .line 320
    :cond_9
    const-string v5, "enableSlideDuration"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 321
    const-string v5, "true"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Landroid_src/mms/c;->w:Z

    goto/16 :goto_0

    .line 322
    :cond_a
    const-string v5, "enableMMSReadReports"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 323
    const-string v5, "true"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Landroid_src/mms/c;->x:Z

    goto/16 :goto_0

    .line 324
    :cond_b
    const-string v5, "enableSMSDeliveryReports"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 325
    const-string v5, "true"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Landroid_src/mms/c;->y:Z

    goto/16 :goto_0

    .line 326
    :cond_c
    const-string v5, "enableMMSDeliveryReports"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 327
    const-string v5, "true"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Landroid_src/mms/c;->z:Z

    goto/16 :goto_0

    .line 329
    :cond_d
    const-string v6, "int"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1d

    .line 331
    const-string v5, "maxMessageSize"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e

    .line 332
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->c:I

    goto/16 :goto_0

    .line 333
    :cond_e
    const-string v5, "maxImageHeight"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_f

    .line 334
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->j:I

    goto/16 :goto_0

    .line 335
    :cond_f
    const-string v5, "maxImageWidth"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 336
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->k:I

    goto/16 :goto_0

    .line 337
    :cond_10
    const-string v5, "defaultSMSMessagesPerThread"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_11

    .line 338
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->m:I

    goto/16 :goto_0

    .line 339
    :cond_11
    const-string v5, "defaultMMSMessagesPerThread"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_12

    .line 340
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->n:I

    goto/16 :goto_0

    .line 341
    :cond_12
    const-string v5, "minMessageCountPerThread"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_13

    .line 342
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->o:I

    goto/16 :goto_0

    .line 343
    :cond_13
    const-string v5, "maxMessageCountPerThread"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 344
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->p:I

    goto/16 :goto_0

    .line 345
    :cond_14
    const-string v5, "recipientLimit"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_15

    .line 346
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->l:I

    .line 347
    sget v0, Landroid_src/mms/c;->l:I

    if-gez v0, :cond_0

    .line 348
    const v0, 0x7fffffff

    sput v0, Landroid_src/mms/c;->l:I

    goto/16 :goto_0

    .line 350
    :cond_15
    const-string v5, "httpSocketTimeout"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_16

    .line 351
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->q:I

    goto/16 :goto_0

    .line 352
    :cond_16
    const-string v5, "minimumSlideElementDuration"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_17

    .line 353
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->r:I

    goto/16 :goto_0

    .line 354
    :cond_17
    const-string v5, "maxSizeScaleForPendingMmsAllowed"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_18

    .line 355
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->B:I

    goto/16 :goto_0

    .line 356
    :cond_18
    const-string v5, "aliasMinChars"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_19

    .line 357
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->D:I

    goto/16 :goto_0

    .line 358
    :cond_19
    const-string v5, "aliasMaxChars"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1a

    .line 359
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->E:I

    goto/16 :goto_0

    .line 360
    :cond_1a
    const-string v5, "smsToMmsTextThreshold"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1b

    .line 361
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->u:I

    goto/16 :goto_0

    .line 362
    :cond_1b
    const-string v5, "maxMessageTextSize"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1c

    .line 363
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->A:I

    goto/16 :goto_0

    .line 364
    :cond_1c
    const-string v5, "maxSubjectLength"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 365
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Landroid_src/mms/c;->F:I

    goto/16 :goto_0

    .line 367
    :cond_1d
    const-string v6, "string"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 369
    const-string v5, "userAgent"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1e

    .line 370
    sput-object v0, Landroid_src/mms/c;->d:Ljava/lang/String;

    goto/16 :goto_0

    .line 371
    :cond_1e
    const-string v5, "uaProfTagName"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1f

    .line 372
    sput-object v0, Landroid_src/mms/c;->e:Ljava/lang/String;

    goto/16 :goto_0

    .line 373
    :cond_1f
    const-string v5, "uaProfUrl"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_20

    .line 374
    sput-object v0, Landroid_src/mms/c;->f:Ljava/lang/String;

    goto/16 :goto_0

    .line 375
    :cond_20
    const-string v5, "httpParams"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_21

    .line 376
    sput-object v0, Landroid_src/mms/c;->g:Ljava/lang/String;

    goto/16 :goto_0

    .line 377
    :cond_21
    const-string v5, "httpParamsLine1Key"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_22

    .line 378
    sput-object v0, Landroid_src/mms/c;->h:Ljava/lang/String;

    goto/16 :goto_0

    .line 379
    :cond_22
    const-string v5, "emailGatewayNumber"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 380
    sput-object v0, Landroid_src/mms/c;->i:Ljava/lang/String;
    :try_end_8
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_8 .. :try_end_8} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto/16 :goto_0

    :cond_23
    move-object v0, v1

    goto/16 :goto_2

    :cond_24
    move-object v0, v1

    goto/16 :goto_3
.end method

.method public static c()Z
    .locals 1

    .prologue
    .line 139
    sget-boolean v0, Landroid_src/mms/c;->a:Z

    return v0
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 143
    sget-object v0, Landroid_src/mms/c;->d:Ljava/lang/String;

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 147
    sget-object v0, Landroid_src/mms/c;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 151
    sget-object v0, Landroid_src/mms/c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public static g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 155
    sget-object v0, Landroid_src/mms/c;->g:Ljava/lang/String;

    return-object v0
.end method

.method public static h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 159
    sget-object v0, Landroid_src/mms/c;->h:Ljava/lang/String;

    return-object v0
.end method

.method public static i()I
    .locals 1

    .prologue
    .line 167
    sget v0, Landroid_src/mms/c;->j:I

    return v0
.end method

.method public static j()I
    .locals 1

    .prologue
    .line 171
    sget v0, Landroid_src/mms/c;->k:I

    return v0
.end method

.method public static k()I
    .locals 1

    .prologue
    .line 199
    sget v0, Landroid_src/mms/c;->q:I

    return v0
.end method

.method public static l()Z
    .locals 1

    .prologue
    .line 227
    sget-boolean v0, Landroid_src/mms/c;->s:Z

    return v0
.end method

.method public static m()Z
    .locals 1

    .prologue
    .line 235
    sget-boolean v0, Landroid_src/mms/c;->C:Z

    return v0
.end method

.method public static n()I
    .locals 1

    .prologue
    .line 239
    sget v0, Landroid_src/mms/c;->D:I

    return v0
.end method

.method public static o()I
    .locals 1

    .prologue
    .line 243
    sget v0, Landroid_src/mms/c;->E:I

    return v0
.end method

.method private static p()V
    .locals 1

    .prologue
    .line 414
    const-string v0, "HTC_PM33100"

    sput-object v0, Landroid_src/mms/c;->d:Ljava/lang/String;

    .line 415
    const-string v0, "http://www.htcmms.com.tw/Android/ATT/PM331/ua-profile.xml"

    sput-object v0, Landroid_src/mms/c;->f:Ljava/lang/String;

    .line 416
    return-void
.end method
