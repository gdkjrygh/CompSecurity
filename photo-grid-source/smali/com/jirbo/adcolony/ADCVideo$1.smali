.class Lcom/jirbo/adcolony/ADCVideo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/ADCVideo;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/ADCVideo;)V
    .locals 0

    .prologue
    .line 425
    iput-object p1, p0, Lcom/jirbo/adcolony/ADCVideo$1;->a:Lcom/jirbo/adcolony/ADCVideo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 428
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo$1;->a:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/e;->setBackgroundColor(I)V

    .line 429
    return-void
.end method
