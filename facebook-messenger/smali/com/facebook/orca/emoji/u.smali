.class Lcom/facebook/orca/emoji/u;
.super Lcom/facebook/inject/d;
.source "EmojiModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/emoji/z;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/emoji/s;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/emoji/s;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/facebook/orca/emoji/u;->a:Lcom/facebook/orca/emoji/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/emoji/s;Lcom/facebook/orca/emoji/t;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/facebook/orca/emoji/u;-><init>(Lcom/facebook/orca/emoji/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/emoji/z;
    .locals 3

    .prologue
    .line 32
    new-instance v2, Lcom/facebook/orca/emoji/z;

    const-class v0, Lcom/facebook/orca/emoji/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/emoji/aa;

    const-class v1, Landroid/content/res/Resources;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/emoji/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/res/Resources;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/emoji/z;-><init>(Lcom/facebook/orca/emoji/aa;Landroid/content/res/Resources;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 28
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/u;->a()Lcom/facebook/orca/emoji/z;

    move-result-object v0

    return-object v0
.end method
