.class Lcom/facebook/orca/stickers/ar;
.super Lcom/facebook/inject/d;
.source "StickersModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/stickers/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/stickers/am;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/stickers/am;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/facebook/orca/stickers/ar;->a:Lcom/facebook/orca/stickers/am;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/ar;-><init>(Lcom/facebook/orca/stickers/am;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/stickers/h;
    .locals 2

    .prologue
    .line 72
    new-instance v1, Lcom/facebook/orca/stickers/h;

    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    invoke-direct {v1, v0}, Lcom/facebook/orca/stickers/h;-><init>(Lcom/facebook/analytics/av;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 68
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/ar;->a()Lcom/facebook/orca/stickers/h;

    move-result-object v0

    return-object v0
.end method
