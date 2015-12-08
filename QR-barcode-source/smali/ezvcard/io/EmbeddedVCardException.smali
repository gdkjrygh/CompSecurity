.class public Lezvcard/io/EmbeddedVCardException;
.super Lezvcard/VCardException;
.source "EmbeddedVCardException.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/io/EmbeddedVCardException$InjectionCallback;
    }
.end annotation


# instance fields
.field private final callback:Lezvcard/io/EmbeddedVCardException$InjectionCallback;

.field private final vcard:Lezvcard/VCard;


# direct methods
.method public constructor <init>(Lezvcard/VCard;)V
    .locals 1
    .param p1, "vcard"    # Lezvcard/VCard;

    .prologue
    .line 60
    invoke-direct {p0}, Lezvcard/VCardException;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lezvcard/io/EmbeddedVCardException;->callback:Lezvcard/io/EmbeddedVCardException$InjectionCallback;

    .line 62
    iput-object p1, p0, Lezvcard/io/EmbeddedVCardException;->vcard:Lezvcard/VCard;

    .line 63
    return-void
.end method

.method public constructor <init>(Lezvcard/io/EmbeddedVCardException$InjectionCallback;)V
    .locals 1
    .param p1, "callback"    # Lezvcard/io/EmbeddedVCardException$InjectionCallback;

    .prologue
    .line 51
    invoke-direct {p0}, Lezvcard/VCardException;-><init>()V

    .line 52
    iput-object p1, p0, Lezvcard/io/EmbeddedVCardException;->callback:Lezvcard/io/EmbeddedVCardException$InjectionCallback;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lezvcard/io/EmbeddedVCardException;->vcard:Lezvcard/VCard;

    .line 54
    return-void
.end method


# virtual methods
.method public getProperty()Lezvcard/property/VCardProperty;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lezvcard/io/EmbeddedVCardException;->callback:Lezvcard/io/EmbeddedVCardException$InjectionCallback;

    if-nez v0, :cond_0

    .line 92
    const/4 v0, 0x0

    .line 95
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lezvcard/io/EmbeddedVCardException;->callback:Lezvcard/io/EmbeddedVCardException$InjectionCallback;

    invoke-interface {v0}, Lezvcard/io/EmbeddedVCardException$InjectionCallback;->getProperty()Lezvcard/property/VCardProperty;

    move-result-object v0

    goto :goto_0
.end method

.method public getVCard()Lezvcard/VCard;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lezvcard/io/EmbeddedVCardException;->vcard:Lezvcard/VCard;

    return-object v0
.end method

.method public injectVCard(Lezvcard/VCard;)V
    .locals 1
    .param p1, "vcard"    # Lezvcard/VCard;

    .prologue
    .line 79
    iget-object v0, p0, Lezvcard/io/EmbeddedVCardException;->callback:Lezvcard/io/EmbeddedVCardException$InjectionCallback;

    if-nez v0, :cond_0

    .line 84
    :goto_0
    return-void

    .line 83
    :cond_0
    iget-object v0, p0, Lezvcard/io/EmbeddedVCardException;->callback:Lezvcard/io/EmbeddedVCardException$InjectionCallback;

    invoke-interface {v0, p1}, Lezvcard/io/EmbeddedVCardException$InjectionCallback;->injectVCard(Lezvcard/VCard;)V

    goto :goto_0
.end method
