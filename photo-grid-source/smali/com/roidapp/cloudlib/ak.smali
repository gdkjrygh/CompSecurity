.class public Lcom/roidapp/cloudlib/ak;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field public c:I

.field public d:I

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput v0, p0, Lcom/roidapp/cloudlib/ak;->c:I

    .line 16
    iput v0, p0, Lcom/roidapp/cloudlib/ak;->d:I

    .line 17
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/ak;->e:Ljava/lang/String;

    .line 20
    iput-object p1, p0, Lcom/roidapp/cloudlib/ak;->a:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Lcom/roidapp/cloudlib/ak;->b:Ljava/lang/Class;

    .line 22
    return-void
.end method
