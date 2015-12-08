.class public Lcom/google/android/gms/internal/os$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/os;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final anb:Lcom/google/android/gms/internal/ov;

.field public final anc:Lcom/google/android/gms/internal/or;

.field public final and:Lcom/google/android/gms/internal/ra$c;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ov;Lcom/google/android/gms/internal/or;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/jx;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ov;

    iput-object v0, p0, Lcom/google/android/gms/internal/os$a;->anb:Lcom/google/android/gms/internal/ov;

    invoke-static {p2}, Lcom/google/android/gms/internal/jx;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/or;

    iput-object v0, p0, Lcom/google/android/gms/internal/os$a;->anc:Lcom/google/android/gms/internal/or;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/os$a;->and:Lcom/google/android/gms/internal/ra$c;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ov;Lcom/google/android/gms/internal/or;Lcom/google/android/gms/internal/os$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/os$a;-><init>(Lcom/google/android/gms/internal/ov;Lcom/google/android/gms/internal/or;)V

    return-void
.end method
