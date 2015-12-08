.class final Lcom/ijoysoft/appwall/t;
.super Lorg/xml/sax/helpers/DefaultHandler;


# instance fields
.field public a:Ljava/util/ArrayList;

.field final synthetic b:Lcom/ijoysoft/appwall/s;

.field private c:Lcom/ijoysoft/appwall/o;

.field private d:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/ijoysoft/appwall/s;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/t;->b:Lcom/ijoysoft/appwall/s;

    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ijoysoft/appwall/s;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ijoysoft/appwall/t;-><init>(Lcom/ijoysoft/appwall/s;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/t;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final characters([CII)V
    .locals 4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    const-string v1, "title"

    iget-object v2, p0, Lcom/ijoysoft/appwall/t;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ijoysoft/appwall/t;->c:Lcom/ijoysoft/appwall/o;

    invoke-virtual {v1, v0}, Lcom/ijoysoft/appwall/o;->c(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v1, "detailed"

    iget-object v2, p0, Lcom/ijoysoft/appwall/t;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ijoysoft/appwall/t;->c:Lcom/ijoysoft/appwall/o;

    invoke-virtual {v1, v0}, Lcom/ijoysoft/appwall/o;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v1, "icon_imagePath"

    iget-object v2, p0, Lcom/ijoysoft/appwall/t;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/ijoysoft/appwall/t;->c:Lcom/ijoysoft/appwall/o;

    new-instance v2, Ljava/lang/StringBuilder;

    sget-object v3, Lcom/ijoysoft/appwall/GiftActivity;->a:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ijoysoft/appwall/o;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const-string v1, "icon_name"

    iget-object v2, p0, Lcom/ijoysoft/appwall/t;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/ijoysoft/appwall/t;->c:Lcom/ijoysoft/appwall/o;

    invoke-virtual {v1, v0}, Lcom/ijoysoft/appwall/o;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    const-string v1, "packageName"

    iget-object v2, p0, Lcom/ijoysoft/appwall/t;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/ijoysoft/appwall/t;->c:Lcom/ijoysoft/appwall/o;

    invoke-virtual {v1, v0}, Lcom/ijoysoft/appwall/o;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    const-string v1, "marketUrl"

    iget-object v2, p0, Lcom/ijoysoft/appwall/t;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ijoysoft/appwall/t;->c:Lcom/ijoysoft/appwall/o;

    invoke-virtual {v1, v0}, Lcom/ijoysoft/appwall/o;->f(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "gift"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/appwall/t;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ijoysoft/appwall/t;->c:Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ijoysoft/appwall/t;->d:Ljava/lang/String;

    return-void
.end method

.method public final startDocument()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/appwall/t;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public final startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 2

    const-string v0, "gift"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ijoysoft/appwall/o;

    invoke-direct {v0}, Lcom/ijoysoft/appwall/o;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/appwall/t;->c:Lcom/ijoysoft/appwall/o;

    iget-object v0, p0, Lcom/ijoysoft/appwall/t;->c:Lcom/ijoysoft/appwall/o;

    const-string v1, "id"

    invoke-interface {p4, v1}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ijoysoft/appwall/o;->a(I)V

    :cond_0
    iput-object p2, p0, Lcom/ijoysoft/appwall/t;->d:Ljava/lang/String;

    return-void
.end method
