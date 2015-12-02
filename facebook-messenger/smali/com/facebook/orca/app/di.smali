.class Lcom/facebook/orca/app/di;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/f/ad;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1051
    iput-object p1, p0, Lcom/facebook/orca/app/di;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1051
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/di;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/f/ad;
    .locals 7

    .prologue
    .line 1055
    new-instance v0, Lcom/facebook/orca/f/ad;

    const-class v1, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/di;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/b/b;

    const-class v2, Lcom/facebook/orca/threads/i;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/di;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/threads/i;

    const-class v3, Lcom/facebook/orca/threads/x;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/di;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/threads/x;

    const-class v4, Lcom/facebook/user/UserKey;

    const-class v5, Lcom/facebook/auth/annotations/LoggedInUserKey;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/orca/app/di;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v5, Lcom/facebook/orca/threads/FolderName;

    const-class v6, Lcom/facebook/orca/annotations/CurrentFolder;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/orca/app/di;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    const-class v6, Lcom/facebook/orca/threads/g;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/app/di;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/threads/g;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/f/ad;-><init>(Lcom/facebook/auth/b/b;Lcom/facebook/orca/threads/i;Lcom/facebook/orca/threads/x;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/threads/g;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1051
    invoke-virtual {p0}, Lcom/facebook/orca/app/di;->a()Lcom/facebook/orca/f/ad;

    move-result-object v0

    return-object v0
.end method
