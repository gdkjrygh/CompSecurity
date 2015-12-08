.class Lcom/jirbo/adcolony/ae$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/ae;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/ae;)V
    .locals 0

    .prologue
    .line 1267
    iput-object p1, p0, Lcom/jirbo/adcolony/ae$7;->a:Lcom/jirbo/adcolony/ae;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1270
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$7;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/ae$7;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/e;->setVisibility(I)V

    .line 1271
    :cond_0
    return-void
.end method
