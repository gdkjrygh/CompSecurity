.class Lcom/facebook/orca/app/q;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/f/j;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 928
    iput-object p1, p0, Lcom/facebook/orca/app/q;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 928
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/q;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/f/j;
    .locals 7

    .prologue
    .line 932
    new-instance v0, Lcom/facebook/orca/f/j;

    const-class v1, Lcom/facebook/orca/f/ad;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/f/ad;

    const-class v2, Lcom/facebook/orca/f/z;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/f/z;

    const-class v3, Lcom/facebook/orca/app/g;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/app/g;

    const-class v4, Lcom/facebook/orca/f/g;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/f/g;

    const-class v5, Lcom/facebook/orca/f/i;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/f/i;

    const-class v6, Lcom/facebook/orca/threads/g;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/app/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/threads/g;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/f/j;-><init>(Lcom/facebook/orca/f/ad;Lcom/facebook/orca/f/z;Lcom/facebook/orca/app/g;Lcom/facebook/orca/f/g;Lcom/facebook/orca/f/i;Lcom/facebook/orca/threads/g;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 928
    invoke-virtual {p0}, Lcom/facebook/orca/app/q;->a()Lcom/facebook/orca/f/j;

    move-result-object v0

    return-object v0
.end method
