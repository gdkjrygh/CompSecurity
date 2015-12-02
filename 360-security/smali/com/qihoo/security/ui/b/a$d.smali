.class Lcom/qihoo/security/ui/b/a$d;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field a:Z

.field b:I

.field c:[I


# direct methods
.method constructor <init>(I[IZ)V
    .locals 0

    .prologue
    .line 206
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 207
    iput p1, p0, Lcom/qihoo/security/ui/b/a$d;->b:I

    .line 208
    iput-object p2, p0, Lcom/qihoo/security/ui/b/a$d;->c:[I

    .line 209
    iput-boolean p3, p0, Lcom/qihoo/security/ui/b/a$d;->a:Z

    .line 210
    return-void
.end method
