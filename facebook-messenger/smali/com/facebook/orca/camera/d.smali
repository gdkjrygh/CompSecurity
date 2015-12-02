.class Lcom/facebook/orca/camera/d;
.super Ljava/lang/Object;
.source "BitmapManager.java"


# instance fields
.field public a:Lcom/facebook/orca/camera/c;

.field public b:Landroid/graphics/BitmapFactory$Options;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    sget-object v0, Lcom/facebook/orca/camera/c;->ALLOW:Lcom/facebook/orca/camera/c;

    iput-object v0, p0, Lcom/facebook/orca/camera/d;->a:Lcom/facebook/orca/camera/c;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/camera/b;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/facebook/orca/camera/d;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/camera/d;->a:Lcom/facebook/orca/camera/c;

    sget-object v1, Lcom/facebook/orca/camera/c;->CANCEL:Lcom/facebook/orca/camera/c;

    if-ne v0, v1, :cond_0

    .line 48
    const-string v0, "Cancel"

    .line 54
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "thread state = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", options = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/camera/d;->b:Landroid/graphics/BitmapFactory$Options;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 55
    return-object v0

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/camera/d;->a:Lcom/facebook/orca/camera/c;

    sget-object v1, Lcom/facebook/orca/camera/c;->ALLOW:Lcom/facebook/orca/camera/c;

    if-ne v0, v1, :cond_1

    .line 50
    const-string v0, "Allow"

    goto :goto_0

    .line 52
    :cond_1
    const-string v0, "?"

    goto :goto_0
.end method
