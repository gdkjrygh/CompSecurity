.class public Lcom/facebook/user/a/f;
.super Ljava/lang/Object;
.source "HanziToPinyin.java"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 313
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 314
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 316
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 317
    iput p1, p0, Lcom/facebook/user/a/f;->a:I

    .line 318
    iput-object p2, p0, Lcom/facebook/user/a/f;->b:Ljava/lang/String;

    .line 319
    iput-object p3, p0, Lcom/facebook/user/a/f;->c:Ljava/lang/String;

    .line 320
    return-void
.end method
