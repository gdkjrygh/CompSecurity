.class Lcom/facebook/orca/app/be;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/messages/model/threads/f;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 2129
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 2129
    invoke-direct {p0}, Lcom/facebook/orca/app/be;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/messages/model/threads/f;
    .locals 3

    .prologue
    .line 2132
    new-instance v0, Lcom/facebook/messages/model/threads/f;

    const-class v1, Ljava/lang/String;

    const-class v2, Lcom/facebook/auth/annotations/ViewerContextUserId;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/app/be;->e(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/messages/model/threads/f;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2129
    invoke-virtual {p0}, Lcom/facebook/orca/app/be;->a()Lcom/facebook/messages/model/threads/f;

    move-result-object v0

    return-object v0
.end method
