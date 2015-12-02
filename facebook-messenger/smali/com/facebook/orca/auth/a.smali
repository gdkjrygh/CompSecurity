.class public Lcom/facebook/orca/auth/a;
.super Ljava/lang/Object;
.source "AutoLoginPushInitializerHook.java"

# interfaces
.implements Lcom/facebook/auth/broadcast/c;


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
.field private b:Lcom/facebook/push/PushInitializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const-class v0, Lcom/facebook/orca/auth/a;

    sput-object v0, Lcom/facebook/orca/auth/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/push/PushInitializer;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/orca/auth/a;->b:Lcom/facebook/push/PushInitializer;

    .line 21
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 25
    sget-object v0, Lcom/facebook/orca/auth/a;->a:Ljava/lang/Class;

    const-string v1, "reporting login on push initializer"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 28
    iget-object v0, p0, Lcom/facebook/orca/auth/a;->b:Lcom/facebook/push/PushInitializer;

    invoke-virtual {v0}, Lcom/facebook/push/PushInitializer;->i()V

    .line 29
    return-void
.end method
