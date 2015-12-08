.class final Lcom/google/android/gms/wearable/internal/ag$c;
.super Lcom/google/android/gms/wearable/internal/ag;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/ag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/ag",
        "<",
        "Lcom/google/android/gms/wearable/MessageApi$MessageListener;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/wearable/internal/ag;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/google/android/gms/wearable/MessageApi$MessageListener;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/bb;
    .locals 1

    invoke-static {p1, p2}, Lcom/google/android/gms/wearable/internal/bb;->b(Lcom/google/android/gms/wearable/MessageApi$MessageListener;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/bb;

    move-result-object v0

    return-object v0
.end method

.method bridge synthetic a(Ljava/lang/Object;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/bb;
    .locals 1

    check-cast p1, Lcom/google/android/gms/wearable/MessageApi$MessageListener;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/ag$c;->a(Lcom/google/android/gms/wearable/MessageApi$MessageListener;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/bb;

    move-result-object v0

    return-object v0
.end method
