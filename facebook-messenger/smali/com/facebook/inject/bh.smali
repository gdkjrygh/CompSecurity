.class public Lcom/facebook/inject/bh;
.super Ljava/lang/Object;
.source "ThreadLocalScope.java"

# interfaces
.implements Lcom/facebook/inject/au;


# static fields
.field private static a:Lcom/facebook/inject/bh;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    new-instance v0, Lcom/facebook/inject/bh;

    invoke-direct {v0}, Lcom/facebook/inject/bh;-><init>()V

    sput-object v0, Lcom/facebook/inject/bh;->a:Lcom/facebook/inject/bh;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    return-void
.end method

.method public static get()Lcom/facebook/inject/bh;
    .locals 1

    .prologue
    .line 21
    sget-object v0, Lcom/facebook/inject/bh;->a:Lcom/facebook/inject/bh;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/inject/a;Ljavax/inject/a;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;",
            "Ljavax/inject/a",
            "<TT;>;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 31
    new-instance v0, Lcom/facebook/inject/be;

    invoke-direct {v0, p2}, Lcom/facebook/inject/be;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method public annotationType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 26
    const-class v0, Lcom/facebook/inject/ThreadLocalScoped;

    return-object v0
.end method
