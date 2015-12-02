.class public Lcom/facebook/orca/emoji/s;
.super Lcom/facebook/inject/c;
.source "EmojiModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 39
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 18
    const-class v0, Lcom/facebook/orca/emoji/z;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/emoji/u;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/emoji/u;-><init>(Lcom/facebook/orca/emoji/s;Lcom/facebook/orca/emoji/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 20
    const-class v0, Lcom/facebook/orca/emoji/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/emoji/v;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/emoji/v;-><init>(Lcom/facebook/orca/emoji/s;Lcom/facebook/orca/emoji/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 23
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsEmojiAttachmentPopupEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/emoji/aj;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 26
    return-void
.end method
