.class Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$BrailleTranslatorImpl;
.super Ljava/lang/Object;
.source "TranslatorManager.java"

# interfaces
.implements Lcom/googlecode/eyesfree/braille/translate/BrailleTranslator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BrailleTranslatorImpl"
.end annotation


# instance fields
.field private final mTable:Ljava/lang/String;

.field final synthetic this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;


# direct methods
.method public constructor <init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;Ljava/lang/String;)V
    .locals 0
    .param p2, "table"    # Ljava/lang/String;

    .prologue
    .line 187
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$BrailleTranslatorImpl;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    iput-object p2, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$BrailleTranslatorImpl;->mTable:Ljava/lang/String;

    .line 189
    return-void
.end method


# virtual methods
.method public backTranslate([B)Ljava/lang/String;
    .locals 4
    .param p1, "cells"    # [B

    .prologue
    .line 206
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$BrailleTranslatorImpl;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # invokes: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->getTranslatorService()Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;
    invoke-static {v2}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$800(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;

    move-result-object v1

    .line 207
    .local v1, "localService":Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;
    if-eqz v1, :cond_0

    .line 209
    :try_start_0
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$BrailleTranslatorImpl;->mTable:Ljava/lang/String;

    invoke-interface {v1, p1, v2}, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;->backTranslate([BLjava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 214
    :goto_0
    return-object v2

    .line 210
    :catch_0
    move-exception v0

    .line 211
    .local v0, "ex":Landroid/os/RemoteException;
    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->LOG_TAG:Ljava/lang/String;
    invoke-static {}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$400()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Error in backTranslate"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 214
    .end local v0    # "ex":Landroid/os/RemoteException;
    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public translate(Ljava/lang/String;)[B
    .locals 4
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 193
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$BrailleTranslatorImpl;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # invokes: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->getTranslatorService()Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;
    invoke-static {v2}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$800(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;

    move-result-object v1

    .line 194
    .local v1, "localService":Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;
    if-eqz v1, :cond_0

    .line 196
    :try_start_0
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$BrailleTranslatorImpl;->mTable:Ljava/lang/String;

    invoke-interface {v1, p1, v2}, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;->translate(Ljava/lang/String;Ljava/lang/String;)[B
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 201
    :goto_0
    return-object v2

    .line 197
    :catch_0
    move-exception v0

    .line 198
    .local v0, "ex":Landroid/os/RemoteException;
    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->LOG_TAG:Ljava/lang/String;
    invoke-static {}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$400()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Error in translate"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 201
    .end local v0    # "ex":Landroid/os/RemoteException;
    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method
