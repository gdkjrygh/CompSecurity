.class Lcom/google/android/gms/internal/af$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/af;-><init>(Lcom/google/android/gms/internal/ay;Lcom/google/android/gms/internal/fy;Lcom/google/android/gms/internal/gs;Landroid/view/View;Lcom/google/android/gms/internal/ah;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic nd:Lcom/google/android/gms/internal/af;

.field final synthetic ne:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/af;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/af$2;->nd:Lcom/google/android/gms/internal/af;

    iput-object p2, p0, Lcom/google/android/gms/internal/af$2;->ne:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/af$2;->nd:Lcom/google/android/gms/internal/af;

    iget-object v1, p0, Lcom/google/android/gms/internal/af$2;->ne:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/af;->a(Lorg/json/JSONObject;)V

    return-void
.end method
