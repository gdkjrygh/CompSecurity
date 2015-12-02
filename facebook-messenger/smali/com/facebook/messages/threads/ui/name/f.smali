.class Lcom/facebook/messages/threads/ui/name/f;
.super Ljava/lang/Object;
.source "ThreadNameViewComputer.java"


# instance fields
.field final a:Landroid/text/TextPaint;

.field final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/text/TextPaint;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/TextPaint;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/facebook/messages/threads/ui/name/f;->a:Landroid/text/TextPaint;

    .line 33
    iput-object p2, p0, Lcom/facebook/messages/threads/ui/name/f;->b:Ljava/util/List;

    .line 34
    return-void
.end method
