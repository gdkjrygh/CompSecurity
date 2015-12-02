.class public Lcom/qihoo/security/engine/cloudscan/QueryItem;
.super Ljava/lang/Object;


# instance fields
.field public a:Lcom/qihoo/security/engine/FileInfo;

.field public b:I

.field public c:J


# direct methods
.method public constructor <init>(Lcom/qihoo/security/engine/FileInfo;IJ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iput p2, p0, Lcom/qihoo/security/engine/cloudscan/QueryItem;->b:I

    iput-wide p3, p0, Lcom/qihoo/security/engine/cloudscan/QueryItem;->c:J

    return-void
.end method
