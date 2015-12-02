.class public Lcom/facebook/fbservice/service/ac;
.super Ljava/lang/Object;
.source "Operation.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/fbservice/service/OperationType;

.field private final c:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/facebook/fbservice/service/ac;->a:Ljava/lang/String;

    .line 18
    iput-object p2, p0, Lcom/facebook/fbservice/service/ac;->b:Lcom/facebook/fbservice/service/OperationType;

    .line 19
    iput-object p3, p0, Lcom/facebook/fbservice/service/ac;->c:Landroid/os/Bundle;

    .line 20
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/OperationType;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/fbservice/service/ac;->b:Lcom/facebook/fbservice/service/OperationType;

    return-object v0
.end method

.method b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/fbservice/service/ac;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/fbservice/service/ac;->c:Landroid/os/Bundle;

    return-object v0
.end method
