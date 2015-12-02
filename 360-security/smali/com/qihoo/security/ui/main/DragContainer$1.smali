.class Lcom/qihoo/security/ui/main/DragContainer$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/o$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/DragContainer;->a(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/DragContainer;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/DragContainer;)V
    .locals 0

    .prologue
    .line 188
    iput-object p1, p0, Lcom/qihoo/security/ui/main/DragContainer$1;->a:Lcom/qihoo/security/ui/main/DragContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 2

    .prologue
    .line 191
    invoke-virtual {p1}, Lcom/nineoldandroids/a/o;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 192
    iget-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer$1;->a:Lcom/qihoo/security/ui/main/DragContainer;

    invoke-static {v1, v0}, Lcom/qihoo/security/ui/main/DragContainer;->a(Lcom/qihoo/security/ui/main/DragContainer;I)V

    .line 193
    return-void
.end method
