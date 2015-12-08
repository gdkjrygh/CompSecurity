.class public final Lcom/google/android/gms/internal/ol;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/is;

.field private final b:Lcom/google/android/gms/internal/or;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/is;Lcom/google/android/gms/internal/oq;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ol;->a:Lcom/google/android/gms/internal/is;

    new-instance v0, Lcom/google/android/gms/internal/or;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/or;-><init>(Lcom/google/android/gms/internal/oq;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ol;->b:Lcom/google/android/gms/internal/or;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/is;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ol;->a:Lcom/google/android/gms/internal/is;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/or;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ol;->b:Lcom/google/android/gms/internal/or;

    return-object v0
.end method
