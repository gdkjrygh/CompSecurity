.class Lcom/facebook/orca/photos/b/q;
.super Lcom/facebook/inject/d;
.source "PhotoUploadModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/photos/b/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/photos/b/o;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/photos/b/o;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/orca/photos/b/q;->a:Lcom/facebook/orca/photos/b/o;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/photos/b/o;Lcom/facebook/orca/photos/b/p;)V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0, p1}, Lcom/facebook/orca/photos/b/q;-><init>(Lcom/facebook/orca/photos/b/o;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/photos/b/h;
    .locals 1

    .prologue
    .line 83
    new-instance v0, Lcom/facebook/orca/photos/b/h;

    invoke-direct {v0}, Lcom/facebook/orca/photos/b/h;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 78
    invoke-virtual {p0}, Lcom/facebook/orca/photos/b/q;->a()Lcom/facebook/orca/photos/b/h;

    move-result-object v0

    return-object v0
.end method
