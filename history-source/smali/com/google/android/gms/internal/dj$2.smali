.class Lcom/google/android/gms/internal/dj$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/dj;->execute()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic rr:Lcom/google/android/gms/internal/dj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/dj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/dj$2;->rr:Lcom/google/android/gms/internal/dj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/dj$2;->rr:Lcom/google/android/gms/internal/dj;

    invoke-static {v0}, Lcom/google/android/gms/internal/dj;->b(Lcom/google/android/gms/internal/dj;)Lcom/google/android/gms/internal/gu;

    move-result-object v0

    const-string v1, "onStorePictureCanceled"

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gu;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
