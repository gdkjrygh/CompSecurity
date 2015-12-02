.class public Lcom/facebook/auth/login/n;
.super Ljava/lang/Object;
.source "AuthOperationTypes.java"


# static fields
.field public static final a:Lcom/facebook/fbservice/service/OperationType;

.field public static final b:Lcom/facebook/fbservice/service/OperationType;

.field public static final c:Lcom/facebook/fbservice/service/OperationType;

.field public static final d:Lcom/facebook/fbservice/service/OperationType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 22
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "auth_sso"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/auth/login/n;->a:Lcom/facebook/fbservice/service/OperationType;

    .line 33
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "auth_password"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/auth/login/n;->b:Lcom/facebook/fbservice/service/OperationType;

    .line 42
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "auth_logout"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/auth/login/n;->c:Lcom/facebook/fbservice/service/OperationType;

    .line 51
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "auth_delete_partial_user"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/auth/login/n;->d:Lcom/facebook/fbservice/service/OperationType;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
