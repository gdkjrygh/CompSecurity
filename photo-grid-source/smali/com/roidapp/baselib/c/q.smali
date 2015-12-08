.class public final Lcom/roidapp/baselib/c/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/roidapp/baselib/c/q;


# instance fields
.field private a:Lcom/roidapp/baselib/c/r;


# direct methods
.method private constructor <init>(Lcom/roidapp/baselib/c/r;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/roidapp/baselib/c/q;->a:Lcom/roidapp/baselib/c/r;

    .line 13
    return-void
.end method

.method public static a(Lcom/roidapp/baselib/c/r;)V
    .locals 1

    .prologue
    .line 16
    sget-object v0, Lcom/roidapp/baselib/c/q;->b:Lcom/roidapp/baselib/c/q;

    if-nez v0, :cond_0

    .line 17
    new-instance v0, Lcom/roidapp/baselib/c/q;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/c/q;-><init>(Lcom/roidapp/baselib/c/r;)V

    sput-object v0, Lcom/roidapp/baselib/c/q;->b:Lcom/roidapp/baselib/c/q;

    .line 19
    :cond_0
    return-void
.end method
