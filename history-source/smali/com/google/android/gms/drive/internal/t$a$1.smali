.class Lcom/google/android/gms/drive/internal/t$a$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/t$a;->onProgress(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/d$b",
        "<",
        "Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic Qf:J

.field final synthetic Qg:J

.field final synthetic Qh:Lcom/google/android/gms/drive/internal/t$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/t$a;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/t$a$1;->Qh:Lcom/google/android/gms/drive/internal/t$a;

    iput-wide p2, p0, Lcom/google/android/gms/drive/internal/t$a$1;->Qf:J

    iput-wide p4, p0, Lcom/google/android/gms/drive/internal/t$a$1;->Qg:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)V
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/drive/internal/t$a$1;->Qf:J

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/t$a$1;->Qg:J

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;->onProgress(JJ)V

    return-void
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/t$a$1;->a(Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)V

    return-void
.end method

.method public gG()V
    .locals 0

    return-void
.end method
