.class Lcom/facebook/orca/app/p;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/f/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 969
    iput-object p1, p0, Lcom/facebook/orca/app/p;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 969
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/p;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/f/i;
    .locals 4

    .prologue
    .line 974
    new-instance v3, Lcom/facebook/orca/f/i;

    const-class v0, Lcom/facebook/orca/f/ad;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/ad;

    const-class v1, Lcom/facebook/orca/f/z;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/f/z;

    const-class v2, Lcom/facebook/orca/prefs/av;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/prefs/av;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/f/i;-><init>(Lcom/facebook/orca/f/ad;Lcom/facebook/orca/f/z;Lcom/facebook/orca/prefs/av;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 969
    invoke-virtual {p0}, Lcom/facebook/orca/app/p;->a()Lcom/facebook/orca/f/i;

    move-result-object v0

    return-object v0
.end method
