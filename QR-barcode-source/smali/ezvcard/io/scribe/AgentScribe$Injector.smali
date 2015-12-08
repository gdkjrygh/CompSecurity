.class Lezvcard/io/scribe/AgentScribe$Injector;
.super Ljava/lang/Object;
.source "AgentScribe.java"

# interfaces
.implements Lezvcard/io/EmbeddedVCardException$InjectionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/io/scribe/AgentScribe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Injector"
.end annotation


# instance fields
.field private final property:Lezvcard/property/Agent;


# direct methods
.method public constructor <init>(Lezvcard/property/Agent;)V
    .locals 0
    .param p1, "property"    # Lezvcard/property/Agent;

    .prologue
    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-object p1, p0, Lezvcard/io/scribe/AgentScribe$Injector;->property:Lezvcard/property/Agent;

    .line 114
    return-void
.end method


# virtual methods
.method public getProperty()Lezvcard/property/VCardProperty;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lezvcard/io/scribe/AgentScribe$Injector;->property:Lezvcard/property/Agent;

    return-object v0
.end method

.method public injectVCard(Lezvcard/VCard;)V
    .locals 1
    .param p1, "vcard"    # Lezvcard/VCard;

    .prologue
    .line 117
    iget-object v0, p0, Lezvcard/io/scribe/AgentScribe$Injector;->property:Lezvcard/property/Agent;

    invoke-virtual {v0, p1}, Lezvcard/property/Agent;->setVCard(Lezvcard/VCard;)V

    .line 118
    return-void
.end method
