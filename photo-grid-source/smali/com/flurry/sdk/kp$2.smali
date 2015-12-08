.class Lcom/flurry/sdk/kp$2;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/flurry/sdk/kp;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/kp;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/flurry/sdk/kp$2;->b:Lcom/flurry/sdk/kp;

    iput-object p2, p0, Lcom/flurry/sdk/kp$2;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 67
    iget-object v0, p0, Lcom/flurry/sdk/kp$2;->b:Lcom/flurry/sdk/kp;

    new-instance v1, Lcom/flurry/sdk/kr;

    iget-object v2, p0, Lcom/flurry/sdk/kp$2;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/flurry/sdk/kr;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lcom/flurry/sdk/kp;->c:Lcom/flurry/sdk/kr;

    .line 68
    return-void
.end method
