.class Lcom/qihoo/security/gamebooster/b$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/qihoo/security/gamebooster/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 105
    new-instance v0, Lcom/qihoo/security/gamebooster/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qihoo/security/gamebooster/b;-><init>(Lcom/qihoo/security/gamebooster/b$1;)V

    sput-object v0, Lcom/qihoo/security/gamebooster/b$a;->a:Lcom/qihoo/security/gamebooster/b;

    return-void
.end method
