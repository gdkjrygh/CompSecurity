.class Lcom/google/inject/spi/Elements$RecordingBinder$1;
.super Ljava/lang/Object;
.source "Elements.java"

# interfaces
.implements Lcom/google/inject/binder/AnnotatedElementBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/spi/Elements$RecordingBinder;->exposeInternal(Lcom/google/inject/Key;)Lcom/google/inject/binder/AnnotatedElementBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/inject/spi/Elements$RecordingBinder;


# direct methods
.method constructor <init>(Lcom/google/inject/spi/Elements$RecordingBinder;)V
    .locals 0

    .prologue
    .line 328
    iput-object p1, p0, Lcom/google/inject/spi/Elements$RecordingBinder$1;->this$0:Lcom/google/inject/spi/Elements$RecordingBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public annotatedWith(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 329
    .local p1, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    return-void
.end method

.method public annotatedWith(Ljava/lang/annotation/Annotation;)V
    .locals 0
    .param p1, "annotation"    # Ljava/lang/annotation/Annotation;

    .prologue
    .line 330
    return-void
.end method
