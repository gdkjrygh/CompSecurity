.class Lcom/facebook/orca/app/ct;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/f/z;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1029
    iput-object p1, p0, Lcom/facebook/orca/app/ct;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1029
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ct;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/f/z;
    .locals 4

    .prologue
    .line 1033
    new-instance v3, Lcom/facebook/orca/f/z;

    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    const-class v1, Lcom/facebook/orca/attachments/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/attachments/a;

    const-class v2, Lcom/facebook/orca/threads/q;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/threads/q;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/f/z;-><init>(Lcom/facebook/orca/f/k;Lcom/facebook/orca/attachments/a;Lcom/facebook/orca/threads/q;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1029
    invoke-virtual {p0}, Lcom/facebook/orca/app/ct;->a()Lcom/facebook/orca/f/z;

    move-result-object v0

    return-object v0
.end method
