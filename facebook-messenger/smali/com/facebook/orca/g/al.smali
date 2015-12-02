.class Lcom/facebook/orca/g/al;
.super Lcom/facebook/inject/d;
.source "ThreadsDbModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/g/y;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/g/ab;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/g/ab;)V
    .locals 0

    .prologue
    .line 142
    iput-object p1, p0, Lcom/facebook/orca/g/al;->a:Lcom/facebook/orca/g/ab;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/g/ab;Lcom/facebook/orca/g/ac;)V
    .locals 0

    .prologue
    .line 142
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/al;-><init>(Lcom/facebook/orca/g/ab;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/g/y;
    .locals 2

    .prologue
    .line 146
    new-instance v1, Lcom/facebook/orca/g/y;

    const-class v0, Lcom/facebook/orca/g/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/g/al;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/aa;

    invoke-direct {v1, v0}, Lcom/facebook/orca/g/y;-><init>(Lcom/facebook/orca/g/aa;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 142
    invoke-virtual {p0}, Lcom/facebook/orca/g/al;->a()Lcom/facebook/orca/g/y;

    move-result-object v0

    return-object v0
.end method
