.class Lcom/facebook/orca/app/cl;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/o/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1741
    iput-object p1, p0, Lcom/facebook/orca/app/cl;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1741
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/cl;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/o/b;
    .locals 9

    .prologue
    .line 1745
    new-instance v0, Lcom/facebook/orca/o/b;

    const-class v1, Lcom/facebook/orca/f/z;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/cl;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/f/z;

    const-class v2, Lcom/facebook/orca/f/ad;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/cl;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/f/ad;

    const-class v3, Lcom/facebook/orca/app/g;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/cl;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/app/g;

    const-class v4, Lcom/facebook/orca/g/t;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/cl;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/g/t;

    const-class v5, Lcom/facebook/orca/sms/bj;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/cl;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/sms/bj;

    const-class v6, Lcom/facebook/orca/protocol/a;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/app/cl;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/protocol/a;

    const-class v7, Lcom/facebook/orca/threads/FolderName;

    const-class v8, Lcom/facebook/orca/annotations/CurrentFolder;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/orca/app/cl;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/o/b;-><init>(Lcom/facebook/orca/f/z;Lcom/facebook/orca/f/ad;Lcom/facebook/orca/app/g;Lcom/facebook/orca/g/t;Lcom/facebook/orca/sms/bj;Lcom/facebook/orca/protocol/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1741
    invoke-virtual {p0}, Lcom/facebook/orca/app/cl;->a()Lcom/facebook/orca/o/b;

    move-result-object v0

    return-object v0
.end method
