.class public Lcom/qihoo/security/opti/a/a$b;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:[I


# direct methods
.method public constructor <init>(Ljava/lang/String;[I)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/qihoo/security/opti/a/a$b;->a:Ljava/lang/String;

    .line 62
    iput-object p2, p0, Lcom/qihoo/security/opti/a/a$b;->b:[I

    .line 63
    return-void
.end method
