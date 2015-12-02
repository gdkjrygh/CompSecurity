.class public Lcom/qihoo/security/leak/e;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/leak/e$a;,
        Lcom/qihoo/security/leak/e$b;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String;


# instance fields
.field private final b:Lcom/qihoo/security/leak/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    const-class v0, Lcom/qihoo/security/leak/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/leak/e;->a:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/qihoo/security/leak/e$a;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/qihoo/security/leak/e;->b:Lcom/qihoo/security/leak/e$a;

    .line 24
    return-void
.end method

.method static a()Lcom/qihoo/security/leak/e;
    .locals 2

    .prologue
    .line 16
    new-instance v0, Lcom/qihoo/security/leak/e$b;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/leak/e$b;-><init>(Landroid/content/Context;)V

    .line 17
    new-instance v1, Lcom/qihoo/security/leak/e;

    invoke-direct {v1, v0}, Lcom/qihoo/security/leak/e;-><init>(Lcom/qihoo/security/leak/e$a;)V

    return-object v1
.end method


# virtual methods
.method public a(Ljava/lang/String;J)J
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/leak/e;->b:Lcom/qihoo/security/leak/e$a;

    invoke-interface {v0, p1, p2, p3}, Lcom/qihoo/security/leak/e$a;->a(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public b(Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 55
    iget-object v0, p0, Lcom/qihoo/security/leak/e;->b:Lcom/qihoo/security/leak/e$a;

    invoke-interface {v0, p1, p2, p3}, Lcom/qihoo/security/leak/e$a;->b(Ljava/lang/String;J)V

    .line 56
    return-void
.end method
