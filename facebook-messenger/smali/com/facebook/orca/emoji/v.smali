.class Lcom/facebook/orca/emoji/v;
.super Lcom/facebook/inject/d;
.source "EmojiModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/emoji/aa;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/emoji/s;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/emoji/s;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/facebook/orca/emoji/v;->a:Lcom/facebook/orca/emoji/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/emoji/s;Lcom/facebook/orca/emoji/t;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1}, Lcom/facebook/orca/emoji/v;-><init>(Lcom/facebook/orca/emoji/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/emoji/aa;
    .locals 1

    .prologue
    .line 43
    new-instance v0, Lcom/facebook/orca/emoji/aa;

    invoke-direct {v0}, Lcom/facebook/orca/emoji/aa;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/v;->a()Lcom/facebook/orca/emoji/aa;

    move-result-object v0

    return-object v0
.end method
