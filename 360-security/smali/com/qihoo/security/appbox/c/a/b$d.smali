.class Lcom/qihoo/security/appbox/c/a/b$d;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/appbox/c/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# static fields
.field public static final a:Lcom/qihoo/security/appbox/c/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 61
    new-instance v0, Lcom/qihoo/security/appbox/c/a/b;

    invoke-direct {v0}, Lcom/qihoo/security/appbox/c/a/b;-><init>()V

    sput-object v0, Lcom/qihoo/security/appbox/c/a/b$d;->a:Lcom/qihoo/security/appbox/c/a/b;

    return-void
.end method
