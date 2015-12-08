.class public final Lcom/roidapp/imagelib/c/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/Object;

.field public c:Lcom/roidapp/imagelib/c/e;

.field public d:Lcom/roidapp/imagelib/c/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/roidapp/imagelib/c/e;Ljava/lang/Object;Lcom/roidapp/imagelib/c/a;)Lcom/roidapp/imagelib/c/h;
    .locals 1

    .prologue
    .line 12
    new-instance v0, Lcom/roidapp/imagelib/c/h;

    invoke-direct {v0}, Lcom/roidapp/imagelib/c/h;-><init>()V

    .line 13
    iput-object p0, v0, Lcom/roidapp/imagelib/c/h;->a:Ljava/lang/String;

    .line 14
    iput-object p2, v0, Lcom/roidapp/imagelib/c/h;->b:Ljava/lang/Object;

    .line 15
    iput-object p1, v0, Lcom/roidapp/imagelib/c/h;->c:Lcom/roidapp/imagelib/c/e;

    .line 16
    iput-object p3, v0, Lcom/roidapp/imagelib/c/h;->d:Lcom/roidapp/imagelib/c/a;

    .line 17
    return-object v0
.end method
