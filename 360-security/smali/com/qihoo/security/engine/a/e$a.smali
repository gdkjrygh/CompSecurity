.class Lcom/qihoo/security/engine/a/e$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/a/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/lang/String;

.field final synthetic c:Lcom/qihoo/security/engine/a/e;


# direct methods
.method constructor <init>(Lcom/qihoo/security/engine/a/e;)V
    .locals 0

    iput-object p1, p0, Lcom/qihoo/security/engine/a/e$a;->c:Lcom/qihoo/security/engine/a/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
