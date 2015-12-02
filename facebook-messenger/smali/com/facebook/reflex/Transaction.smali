.class public Lcom/facebook/reflex/Transaction;
.super Ljava/lang/Object;
.source "Transaction.java"


# static fields
.field public static final a:Lcom/facebook/reflex/Transaction;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    new-instance v0, Lcom/facebook/reflex/Transaction;

    invoke-direct {v0}, Lcom/facebook/reflex/Transaction;-><init>()V

    sput-object v0, Lcom/facebook/reflex/Transaction;->a:Lcom/facebook/reflex/Transaction;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/facebook/reflex/Transaction;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/facebook/reflex/Transaction;->a:Lcom/facebook/reflex/Transaction;

    return-object v0
.end method

.method private static native nativeBegin()V
.end method

.method private static native nativeCommit()V
.end method


# virtual methods
.method public b()V
    .locals 0

    .prologue
    .line 24
    invoke-static {}, Lcom/facebook/reflex/Transaction;->nativeBegin()V

    .line 25
    return-void
.end method

.method public c()V
    .locals 0

    .prologue
    .line 28
    invoke-static {}, Lcom/facebook/reflex/Transaction;->nativeCommit()V

    .line 29
    return-void
.end method
