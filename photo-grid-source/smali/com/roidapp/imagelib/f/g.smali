.class final Lcom/roidapp/imagelib/f/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lcom/roidapp/imagelib/f/i;

.field b:Lorg/xml/sax/Attributes;


# direct methods
.method private constructor <init>(Lorg/xml/sax/Attributes;)V
    .locals 3

    .prologue
    .line 704
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 701
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/f/g;->a:Lcom/roidapp/imagelib/f/i;

    .line 705
    iput-object p1, p0, Lcom/roidapp/imagelib/f/g;->b:Lorg/xml/sax/Attributes;

    .line 706
    const-string v0, "style"

    invoke-static {v0, p1}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v0

    .line 707
    if-eqz v0, :cond_0

    .line 708
    new-instance v1, Lcom/roidapp/imagelib/f/i;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/roidapp/imagelib/f/i;-><init>(Ljava/lang/String;B)V

    iput-object v1, p0, Lcom/roidapp/imagelib/f/g;->a:Lcom/roidapp/imagelib/f/i;

    .line 710
    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Lorg/xml/sax/Attributes;B)V
    .locals 0

    .prologue
    .line 700
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/f/g;-><init>(Lorg/xml/sax/Attributes;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 713
    const/4 v0, 0x0

    .line 714
    iget-object v1, p0, Lcom/roidapp/imagelib/f/g;->a:Lcom/roidapp/imagelib/f/i;

    if-eqz v1, :cond_0

    .line 715
    iget-object v0, p0, Lcom/roidapp/imagelib/f/g;->a:Lcom/roidapp/imagelib/f/i;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/f/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 717
    :cond_0
    if-nez v0, :cond_1

    .line 718
    iget-object v0, p0, Lcom/roidapp/imagelib/f/g;->b:Lorg/xml/sax/Attributes;

    invoke-static {p1, v0}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v0

    .line 720
    :cond_1
    return-object v0
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 728
    invoke-virtual {p0, p1}, Lcom/roidapp/imagelib/f/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 729
    if-eqz v1, :cond_0

    const-string v2, "#"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 736
    :cond_0
    :goto_0
    return-object v0

    .line 733
    :cond_1
    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 736
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/Float;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 751
    invoke-virtual {p0, p1}, Lcom/roidapp/imagelib/f/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 752
    if-nez v1, :cond_0

    .line 758
    :goto_0
    return-object v0

    .line 756
    :cond_0
    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 758
    :catch_0
    move-exception v1

    goto :goto_0
.end method
