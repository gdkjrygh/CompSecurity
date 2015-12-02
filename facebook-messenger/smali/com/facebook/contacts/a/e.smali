.class public Lcom/facebook/contacts/a/e;
.super Ljava/lang/Object;
.source "MobileAppDataCache.java"

# interfaces
.implements Lcom/facebook/auth/f/b;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const-class v0, Lcom/facebook/contacts/a/e;

    sput-object v0, Lcom/facebook/contacts/a/e;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/contacts/a/e;->b:Lcom/google/common/a/es;

    return-object v0
.end method

.method public a(Lcom/google/common/a/es;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 23
    iput-object p1, p0, Lcom/facebook/contacts/a/e;->b:Lcom/google/common/a/es;

    .line 24
    sget-object v0, Lcom/facebook/contacts/a/e;->a:Ljava/lang/Class;

    const-string v1, "mobile app data cache updated"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 25
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Lcom/facebook/contacts/a/e;->b:Lcom/google/common/a/es;

    .line 41
    iput-object v0, p0, Lcom/facebook/contacts/a/e;->c:Lcom/google/common/a/es;

    .line 42
    return-void
.end method

.method public b(Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 32
    iput-object p1, p0, Lcom/facebook/contacts/a/e;->c:Lcom/google/common/a/es;

    .line 33
    return-void
.end method

.method public d()V
    .locals 0

    .prologue
    .line 46
    invoke-virtual {p0}, Lcom/facebook/contacts/a/e;->b()V

    .line 47
    return-void
.end method
