.class Lcom/jirbo/adcolony/ae$5;
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
    .line 1136
    iput-object p1, p0, Lcom/jirbo/adcolony/ae$5;->a:Lcom/jirbo/adcolony/ae;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1139
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$5;->a:Lcom/jirbo/adcolony/ae;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/ae;->D:Z

    if-eqz v0, :cond_0

    .line 1141
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$5;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/ae$5;->a:Lcom/jirbo/adcolony/ae;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/ae$5;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 1143
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$5;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/jirbo/adcolony/ADCVideo;->m:Z

    .line 1144
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$5;->a:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ae;->f()V

    .line 1147
    :cond_0
    return-void
.end method
