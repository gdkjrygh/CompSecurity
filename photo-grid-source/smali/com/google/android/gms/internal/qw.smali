.class final Lcom/google/android/gms/internal/qw;
.super Lcom/google/android/gms/internal/tj;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/tj",
        "<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/qv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/qv",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/vq;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/vq",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/qv;Lcom/google/android/gms/internal/vq;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/qv",
            "<TT;>;",
            "Lcom/google/android/gms/internal/vq",
            "<TT;>;)V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/qx;

    invoke-direct {v0, p3, p2}, Lcom/google/android/gms/internal/qx;-><init>(Lcom/google/android/gms/internal/vq;Lcom/google/android/gms/internal/qv;)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/tj;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/vp;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/qw;->a:Lcom/google/android/gms/internal/qv;

    iput-object p3, p0, Lcom/google/android/gms/internal/qw;->b:Lcom/google/android/gms/internal/vq;

    return-void
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/internal/pl;)Lcom/google/android/gms/internal/vo;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/pl;",
            ")",
            "Lcom/google/android/gms/internal/vo",
            "<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p1, Lcom/google/android/gms/internal/pl;->b:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {p1}, Lcom/google/android/gms/internal/yn;->a(Lcom/google/android/gms/internal/pl;)Lcom/google/android/gms/internal/be;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/vo;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/be;)Lcom/google/android/gms/internal/vo;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 0
    check-cast p1, Ljava/io/InputStream;

    .line 1000
    iget-object v0, p0, Lcom/google/android/gms/internal/qw;->b:Lcom/google/android/gms/internal/vq;

    iget-object v1, p0, Lcom/google/android/gms/internal/qw;->a:Lcom/google/android/gms/internal/qv;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/qv;->a(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/vq;->a(Ljava/lang/Object;)V

    .line 0
    return-void
.end method
