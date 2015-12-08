.class final Lcom/mopub/mobileads/util/vast/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/mopub/mobileads/util/vast/b;

.field private final b:Lorg/w3c/dom/Node;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/util/vast/b;Lorg/w3c/dom/Node;)V
    .locals 2

    .prologue
    .line 163
    iput-object p1, p0, Lcom/mopub/mobileads/util/vast/d;->a:Lcom/mopub/mobileads/util/vast/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    if-nez p2, :cond_0

    .line 165
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Media node cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 167
    :cond_0
    iput-object p2, p0, Lcom/mopub/mobileads/util/vast/d;->b:Lorg/w3c/dom/Node;

    .line 168
    return-void
.end method


# virtual methods
.method final a()Ljava/lang/Integer;
    .locals 2

    .prologue
    .line 175
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/d;->b:Lorg/w3c/dom/Node;

    const-string v1, "width"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/vast/XmlUtils;->b(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method final b()Ljava/lang/Integer;
    .locals 2

    .prologue
    .line 179
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/d;->b:Lorg/w3c/dom/Node;

    const-string v1, "height"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/vast/XmlUtils;->b(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method final c()Ljava/lang/String;
    .locals 2

    .prologue
    .line 183
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/d;->b:Lorg/w3c/dom/Node;

    const-string v1, "type"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/vast/XmlUtils;->c(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/d;->b:Lorg/w3c/dom/Node;

    invoke-static {v0}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Node;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
