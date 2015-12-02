.class Lcom/qihoo/security/gamebooster/b$b;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field a:Z

.field b:Z

.field c:Z

.field d:Ljava/lang/String;

.field e:Z

.field f:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZZZLjava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 1015
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1016
    iput-boolean p1, p0, Lcom/qihoo/security/gamebooster/b$b;->a:Z

    .line 1017
    iput-boolean p2, p0, Lcom/qihoo/security/gamebooster/b$b;->b:Z

    .line 1018
    iput-boolean p3, p0, Lcom/qihoo/security/gamebooster/b$b;->c:Z

    .line 1019
    iput-object p4, p0, Lcom/qihoo/security/gamebooster/b$b;->d:Ljava/lang/String;

    .line 1020
    iput-boolean p5, p0, Lcom/qihoo/security/gamebooster/b$b;->e:Z

    .line 1021
    iput-object p6, p0, Lcom/qihoo/security/gamebooster/b$b;->f:Ljava/lang/String;

    .line 1022
    return-void
.end method
