.class final Lcom/facebook/FacebookSdk$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic val$applicationContext:Landroid/content/Context;

.field final synthetic val$applicationId:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 395
    iput-object p1, p0, Lcom/facebook/FacebookSdk$3;->val$applicationContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/facebook/FacebookSdk$3;->val$applicationId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 398
    iget-object v0, p0, Lcom/facebook/FacebookSdk$3;->val$applicationContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/FacebookSdk$3;->val$applicationId:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/facebook/FacebookSdk;->publishInstallAndWaitForResponse(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/GraphResponse;

    .line 399
    return-void
.end method
