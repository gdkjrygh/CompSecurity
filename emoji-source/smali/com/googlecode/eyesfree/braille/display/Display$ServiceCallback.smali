.class Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;
.super Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback$Stub;
.source "Display.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/eyesfree/braille/display/Display;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ServiceCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/googlecode/eyesfree/braille/display/Display;


# direct methods
.method private constructor <init>(Lcom/googlecode/eyesfree/braille/display/Display;)V
    .locals 0

    .prologue
    .line 190
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback$Stub;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/googlecode/eyesfree/braille/display/Display;Lcom/googlecode/eyesfree/braille/display/Display$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;
    .param p2, "x1"    # Lcom/googlecode/eyesfree/braille/display/Display$1;

    .prologue
    .line 190
    invoke-direct {p0, p1}, Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;-><init>(Lcom/googlecode/eyesfree/braille/display/Display;)V

    return-void
.end method


# virtual methods
.method public onDisplayConnected(Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;)V
    .locals 2
    .param p1, "displayProperties"    # Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;

    .prologue
    .line 194
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->mHandler:Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/display/Display;->access$300(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->reportConnectionState(ILcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;)V

    .line 195
    return-void
.end method

.method public onDisplayDisconnected()V
    .locals 3

    .prologue
    .line 199
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->mHandler:Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/display/Display;->access$300(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->reportConnectionState(ILcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;)V

    .line 200
    return-void
.end method

.method public onInput(Lcom/googlecode/eyesfree/braille/display/BrailleInputEvent;)V
    .locals 1
    .param p1, "inputEvent"    # Lcom/googlecode/eyesfree/braille/display/BrailleInputEvent;

    .prologue
    .line 204
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->mHandler:Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/display/Display;->access$300(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->reportInputEvent(Lcom/googlecode/eyesfree/braille/display/BrailleInputEvent;)V

    .line 205
    return-void
.end method
