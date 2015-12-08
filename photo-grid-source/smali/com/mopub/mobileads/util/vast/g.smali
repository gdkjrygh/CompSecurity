.class final Lcom/mopub/mobileads/util/vast/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/mobileads/util/vast/XmlUtils$NodeProcessor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/mopub/mobileads/util/vast/XmlUtils$NodeProcessor",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 235
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic process(Lorg/w3c/dom/Node;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 235
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/util/vast/g;->process(Lorg/w3c/dom/Node;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final process(Lorg/w3c/dom/Node;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 238
    invoke-static {p1}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Node;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
