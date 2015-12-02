.class Lcom/nineoldandroids/b/c$b;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nineoldandroids/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field a:I

.field b:F

.field c:F


# direct methods
.method constructor <init>(IFF)V
    .locals 0

    .prologue
    .line 193
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 194
    iput p1, p0, Lcom/nineoldandroids/b/c$b;->a:I

    .line 195
    iput p2, p0, Lcom/nineoldandroids/b/c$b;->b:F

    .line 196
    iput p3, p0, Lcom/nineoldandroids/b/c$b;->c:F

    .line 197
    return-void
.end method
